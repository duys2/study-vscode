# 1. 반복문

for letter in ['a', 'b', 'c']:
    print(letter)

# 2. 인덱스 출력

i = 0

for letter in ['a', 'b', 'c']:
    print(i, letter)
    i += 1

# 3. range(), len()

letters = ['a', 'b', 'c']

for i in range(len(letters)):
    letter = letters[i]
    print(i, letter)

# 4. enumerate(), 인덱스, 값 동시에 접근

letters = ['a', 'b', 'c']

for i, letter in enumerate(letters):
    print(i, letter)

# 4.1. enumerate(), 인덱스, 값 동시에 접근

for i, letter in enumerate(letters, start=100):
    print(i, letter)

# 5. enumerate() -> 결과 tuple

letters = ['a', 'b', 'c']

for value in enumerate(letters):
    print(value)


# 중첩리스트
matrix = [['a', 'b', 'c'], ['d', 'e', 'f'], ['g', 'h', 'i']]

# 인덱스, 값 출력

# 1.range()

for r in range(len(matrix)):
    for c in range(len(matrix[r])):
        print(r, c, matrix[r][c])

# 2.enumerate()

for r, value in enumerate(matrix):
    for c, letter in enumerate(value):
        print(r, c, letter)

