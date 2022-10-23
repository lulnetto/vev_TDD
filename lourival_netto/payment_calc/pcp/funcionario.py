class funcionario:
    #Constructor
    def __init__(self, nome, email, salario_base, cargo):
        self.nome = nome
        self.email = email
        self.salario_base = salario_base
        self.cargo = cargo
    
    def calcSalario(self):
        if self.salario_base >= 3000:
            return self.salario_base*0.8
        return self.salario_base*0.9