import pytest
import math
import fonctions as f

def test_1():
	assert f.puissance(2.0, 3.0) == 8
	assert f.puissance(2.0, 2.0) == 4

def test_2():
	assert f.puissance(-2.0, 3.0) == -8
	assert f.puissance(-2.0, 2.0) == 4
	assert f.puissance(2.0, -2.0) == 0.25
	assert f.puissance(2.0, math.pi) == math.exp(math.pi * math.log(2.0))

def test_4():
	with pytest.raises(ValueError):
		f.puissance(0.0, -1.0)
