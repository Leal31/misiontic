archivo = open('mbox.txt')

for l in archivo:
    l = l.rstrip()
    if l.startswith('From:'):
        print(l)
