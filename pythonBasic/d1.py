# 한 줄 주석
# 변수
a = 1
b = "홍길동"
c = 2.5
d = True
e = "홍길동" + "전우치"
f = "홍길동" * 3
''' 여러 줄 주석
if :
elif :
else :
for 변수 in range :
'''
print(a)
print(b)
print(c)
print(d)
print(e)
print(f)
# 튜플? → a, b = (2, 3)
print(type(e))
# 변수 대소문자 구분 안 함
name = input("이름 입력  : ")
# print(name)
# input은 string
age = int(input("나이 입력 : "))
# print(age, type(age))
print('%s반갑다.%d살이구나' %(name, age))
print('%s반갑다' %name)