def puissance(a, b):
	res = a
	if type(a) is not int or type(b) is not int:
		raise TypeError("pas entier")
	for i in range(b-1):
		res *= a
	return res
