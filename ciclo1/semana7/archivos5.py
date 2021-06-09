archivo = open('mbox.txt')

for l in archivo:
    l = l.rstrip()
    if l.find('@uct.ac.za'):
        print(l)
