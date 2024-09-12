def puissance(a, b):
	res = a

	if type(a) is not int or type(b) is not int:
		raise TypeError("pas entier")
	if a == 0 and b < 0:
		raise ValueError("0^-n invalide")

	if b >= 0:
		for i in range(b-1):
			res *= a
		return res
	return 1/f.puissance(a, -b)
