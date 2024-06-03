a = 1234

print(a)
print()
print('%d' %a)
print('%10d' %a)
print('%-10d' %a) # -는 방향(왼쪽부터)
print('%010d' %a)

a = 3.14

print('%f' %a)
print('%.6f' %a)

import math

print(math.pi)
print(math.sin(1/6*math.pi))
print(dir(math))

print(math.ceil(3.14)) # 올림
print(math.floor(3.14)) # 절사(내림)
print(math.pow(2, 3)) # 제곱(2^3)

a = "동해물과 백두산이 마르고 닳도록"
b = "동해물과 백두산이\n 마르고 닳도록"

print('a -> ', a)
print('b -> ', b)

str = 'I said, "It\'s python"'
print(str)

# 그대로 출력됨
c = '''동해물과 백
두산이 마르고 닳도록'''
print(c)

d='안녕'
e='파이썬'
f=d+e

print(f)

print('안녕''파이썬')

g='abcdef'

print(g)
print(g[-1])

h='hello'

print(h[1])
print(h[-1])
print(h[1:2])
print(h[1:4])

a='hello!python'

print(len(a))

print(a[:4])
print(a[4:])
print(a[-1])
print(a[-2:])
print(a[0:6:2]) # 시작 : 끝 : 증감값
print(a[::2])
print(a[::-1])

print(a[5:3:-1])

# 시작 : 마지막 위치 : 증가 => 마지막 위치 + 1
# 시작 : 마지막 위치 : 감소 => 마지막 위치 - 1

# O -> ☆

i = a.replace('o', '☆')
print(i)

print(a.capitalize()) # 첫 글자 대문자
print(a.upper())
print(a.lower())
print(a.find('D'))
print('___'.join(a))
print(len(a))
print(a.split())