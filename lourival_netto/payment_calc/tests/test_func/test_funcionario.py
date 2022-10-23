from pcp import funcionario

def test_cargo_desenvolvedor_20():
    func = funcionario('netto','abc',3000,'DESENVOLVEDOR')

    assert 2400 == func.calcSalario()

def test_cargo_desenvolvedor_10():
    func = funcionario('netto','abc',3000,'DESENVOLVEDOR')
    
    assert 2700 == func.calcSalario()