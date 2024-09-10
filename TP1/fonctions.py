def puissance(a, b):
	if type(a) is not int or type(b) is not int:
		raise TypeError("pas entier")
	return a**b
