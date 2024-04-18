# 요세푸스문제
# 1번부터 N번까지 N명의 사람이 원을 이뤄 앉아있다.
# 정수 K -> 순서대로 K번째 사람 제거

# 7 3 : 1번부터 7번까지 원을 이뤄 앉고, 순서대로 3번째 사람을 제거
# 3 ->
# 1 2 3 4 5 6 7
# 3 6 2 7 5 1 4

# queue = [4, 5, 6]
# queue.append(7)
# print(queue)
# queue.pop(0)
# print(queue)
# queue.pop(0)
# print(queue)


# 배열에 입력
# num = list(map(int, input().split()))

# 한 번에 정수 여러개 입력
n, k = map(int, input().split(" "))

# i = 0 + 3 현재 idx가 5인데, 다음 3번째가 배열 인덱스 넘어가서 0번지로 돌아가야 한다면
# 예를 들어 1 2 3 4 5 6 7 -> 1 2 4 5 6 7 -> 1 2 4 5 7 -> (6)의 자리에서 +3번째인 (2)를 삭제해야 함
# 4번째 idx에서 ,

# h= len(li) - li(now) <3 이라면
# h + __ = 3 -> __ = 3-h
# 만약 +3이 배열 범위초과할 경우 남은 idx 칸 수 + __ = 3 -> __ 번째 인덱스 요소를 삭제해주면 됨
# 아닐 경우 +3 삭제

# list에 1부터 n까지 할당
li = list(0 for i in range(n))
for i in range(0, len(li)):
    li[i] = i + 1

# 파이썬에서 큐 자료구조

i = 0
i2 = 0
result = list()
while len(li) != 0:
    # 만약 +3 idx가 비어있지 않다면 li.remove(3), i+=3
    # 만약 +#3 idx가 비어있다면
    # h = len(li) - li(i),  i = 3-h
    if i + k - 1 < len(li):
        result.append(li[i + k - 1])
        del li[i + k - 1]
        i += k - 1
    elif (k - 1) >= len(li):
        result.append(li[i2])
        del li[i2]
    elif (i + k - 1) > len(li):
        h = (k - 1) - len(li) + i
        i = h
        result.append(li[i])
        del li[i]
e = "<"
f = ">"
# print(''.join(result))  int형 리스트이므로 에러
strList = ", ".join(map(str, result))
print(e + strList + f)
