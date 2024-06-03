# 딕셔너리

a = {1: '사과', 2: '배', 3: '대추'}

del a[3]
print(a)

print(2 in a)
a.pop(1)
print(a)
print(a.items())
print(a.keys())
print(a.values())

fruit = {1: '사과', 2: '배', 3: '대추', 4: '메론'}

for i in fruit:
    print(i, end='')

for k, v in fruit.items():
    print(k, v)

for k in fruit.keys():
    print(k)

for v in fruit.values():
    print(v)

# name = {1: 'a', 2: 'b', 3: 'c', 4: 'd'}
# x = {k: v for k, v in dict.fromkeys(name).items()}
# print(x)

# y = {k: 0 for k, v in dict.fromkeys(name).keys()}
# print(y)

# 값을 키로 사용

fruit = {1: '사과', 2: '배', 3: '대추', 4: '메론'}
x = {v: k for k, v in fruit.items()}
print(x)

# 특정 값 찾아 삭제

# for k, v in fruit.items():
#     if v == '배':
#         del fruit[k]

fruit = {1: '사과', 2: '배', 3: '대추', 4: '메론'}
x = {k: v for k, v in fruit.items() if v != '배'}
print(x)