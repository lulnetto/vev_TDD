from pcp import funcionario

def test_cargo_desenvolvedor_20():
    func = funcionario('netto','abc',3000,'DESENVOLVEDOR')

    assert 2400 == func.calcSalario()

def test_cargo_desenvolvedor_10():
    func = funcionario('netto','abc',2000,'DESENVOLVEDOR')
    
    assert 1800 == func.calcSalario()

def test_cargo_dba_25():
    func = funcionario('netto','abc',3000,'DBA')

    assert 2250 == func.calcSalario()

def test_cargo_dba_15():
    func = funcionario('netto','abc',1000,'DBA')
    
    assert 850 == func.calcSalario()

def test_cargo_testador_25():
    func = funcionario('netto','abc',3000,'TESTADOR')

    assert 2250 == func.calcSalario()

def test_cargo_testador_15():
    func = funcionario('netto','abc',1000,'TESTADOR')
    
    assert 850 == func.calcSalario()


def test_cargo_gerente_30():
    func = funcionario('netto','abc',10000,'GERENTE')

    assert 7000 == func.calcSalario()

def test_cargo_gerente_20():
    func = funcionario('netto','abc',1000,'GERENTE')
    
    assert 800 == func.calcSalario()


