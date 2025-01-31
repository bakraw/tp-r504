#!/bin/bash

nmap -sn -T4 172.16.0.0/24 -oG /tmp/scan.txt > /dev/null

awk '/^Host: / && !seen[$2]++ {print $2}' /tmp/scan.txt | sort | uniq > /tmp/ip.txt

echo "# IP  ;  PORTS TCP OUVERTS  ;  PORTS UDP OUVERTS"> scan.csv

for ip in $(cat /tmp/ip.txt); do
	echo -n "Scan de $ip..."
	nmap -sN -sU -T4 -F $ip -oG /tmp/scan.txt > /dev/null
	tcp_count=$(grep '^[0-9]*/tcp' /tmp/scan.txt | wc -l)
	udp_count=$(grep '^[0-9]*/udp' /tmp/scan.txt | wc -l)
	echo " $tcp_count port(s) TCP ouverts & $udp_count port(s) UDP ouverts"
	echo "$ip;$tcp_count;$udp_count" >> scan.csv
done

echo ">> Bilan sauvegardé dans scan.csv"
