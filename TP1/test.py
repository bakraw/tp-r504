import pytest
import fonctions as f

def test_1():
	assert f.puissance(2, 3) == 8
	assert f.puissance(2, 2) == 4

def test_2():
	assert f.puissance(-2, 3) == -8
	assert f.puissance(-2, 2) == 4
	assert f.puissane(2, -2) == 1/4
	assert f.puissance(2, 3.14) == 1/2**3.14
