import math

def puissance(a, b):
	res = a

	if type(a) is not float or type(b) is not float:
		raise TypeError("les nombres doivent etre des flottants")
	if a == 0 and b < 0:
		raise ValueError("0^-n invalide")

	if a.is_integer() and b.is_integer():
		if b >= 0:
			for i in range(int(b)-1):
				res *= a
			return res
		return 1/puissance(a, -b)

	return math.exp(b * math.log(a))
