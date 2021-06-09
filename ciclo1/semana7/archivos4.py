archivo = open('mbox.txt')

for l in archivo:
    if not l.startswith('From:'):
        continue
    print(l)
