import xml.etree.ElementTree as ET

caminho = "C:\\Users\\renan\\OneDrive\\Desktop\\Programação\\FACISA\\Conectar Banco de Dados com POO\\CODIGOS_EM_PYTHON\\passageiros.xml"
tree = ET.parse(caminho)
root = tree.getroot() # Retorna o representante do elemento raiz nesse caso passageiros

for passageiro in root.findall('passageiro'): #Procura o elemento filho nesse caso apenas passageiro
    nome = passageiro.find('name').text #find()é semelhante a findall(), mas só retorna o primeiro elemento que corresponde à tag especificada.
    origem = passageiro.find('origin').text
    destino = passageiro.find('destiny').text
    print("Nome do pasageiro: %s \nOrigem: %s \nDestino: %s \n \n" %(nome, origem, destino))