#!/bin/bash

nmap -sn -T4 172.16.0.0/24 -oG /tmp/scan.txt > /dev/null

awk '/^Host: / && !seen[$2]++ {print $2}' /tmp/scan.txt | sort | uniq > /tmp/ip.txt

echo "# IP  ;  PORTS TCP OUVERTS"> scan.csv

for ip in $(cat /tmp/ip.txt); do
	echo -n "Scan de $ip..."
	nmap -sN -T4 -F $ip > /tmp/scan.txt
	ports_count=$(grep '^[0-9]' /tmp/scan.txt | wc -l)
	echo " $ports_count port(s) TCP ouverts"
	echo "$ip;$ports_count" >> scan.csv
done

echo ">> Bilan sauvegardé dans scan.csv"
