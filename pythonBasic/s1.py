# # 열거형 자료
# # 반복

# # 리스트, 튜플, 딕셔너리, 집합

# # 리스트, list
# a = []
# b = [10, 20]
# c = list()
# d = [1000, 1000, 'apple', 'orange']
# e = [10.2, 'yellow', 3, 4, True]

# # 출력
# print(b)
# print(type(b))
# print(d[2])
# print(d[2][0])

# f = ['아이유', 160, '대구', 30, 'B']
# print(f.index(160))  # 인덱스값 출력
# print(f[-2])

# # 슬라이싱 → 주소 범위
# # f = ['아이유', 160, '대구', 30, 'B']
# print(f[0:2])
# print(f[0:4:2])

# g = [10, 20, 30, 40]
# g[0:2] = [15, 25, 35]
# print(g)

# g[1] = [100, 200, 300]
# print(g)

# g.append(1032414)  # 같은 거임 → g.insert(len(g), 100)
# print(g)

# g.insert(2, 234567890)
# g.insert(0, 168944514)

# print(g)

# h = [10, 20, 30]
# h.insert(2, [40, 50])
# print(h)

# # pop, del, remove → 삭제 내장함수

# del h[2] # 얘는 사용법이 좀 다름

# print(abs(-19))
# print(pow(2,2))

# a = [10,20,30,40]

# for i in range(len(a)) :
#     print(a[i])

# int(값) 형변환

# 튜플

# (,,,)
# ()생략 가능
# a=1,2
# a=(1,2)
# a=1,
# a=(1,)
# a=(1,2,(3,4))

# b = 10, 20, 30

# print(len(b))
# print(b[-1])
# print(b[1:4])
# print(b[1:3:2])

# c = tuple(i for i in range(10) if i % 3 == 0)

# # Q. 길이가 5개인 문자를 리스트로 추출
# # a=['apple', 'zip','hotel','daegu', 'seoul']

# # 딕셔너리 만들기
# a = {'이름': '아이유', '나이': 20}
# b = dict(이름='아이유', 나이=20)

# 집합 (set)
# 중복, 인덱스 X

b = {1, 2, 3, 4, 5, 6}
c = {2, 4, 6, 8}

# 합집합, |, union

d = b | c
print(d)

# 교집합, &, intersection
d = b & c  # b.intersection(c)
print(d)

# 차집합, -, difference
d = b-c  # b.difference(c)
print(d)

# 배타적논리합, ^, symmetric_difference
d = b ^ c  # b.symmetric_difference(c)
print(d)