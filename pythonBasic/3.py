# def solution(seoul):
#     answer = ''
#     for i in range(len(seoul)):
#         if(seoul[i] == 'Kim'):
#           answer = '김서방은' + i + '에 있다.'
#     return answer

# def solution(n):
#     answer = 0
#     if (n % 2 != 0):
#         for i in range(n+1):
#             if (i % 2 != 0):
#                 answer += i
#     else:
#         for i in range(n+1):
#             if (i % 2 == 0):
#                 answer += i*i
#     return answer

# print(solution(7))
# print(solution(10))

# def solution(number, limit, power):
#     answer = 0  # 철의 무게(무기 공격력)
#     count = [0]*(number)  # 구매할 무기의 공격력

#     for i in range(1, number + 1):
#         for j in range(1, i + 1):
#             if (i % j == 0):
#                 count[i-1] += 1

#     for i in range(len(count)):
#         if (count[i] > limit):
#             count[i] = power

#     for i in range(len(count)):
#         answer += count[i]

#     return answer

# print(solution(10, 3, 2))