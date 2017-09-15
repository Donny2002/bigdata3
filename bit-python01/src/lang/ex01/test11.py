# 컬렉션 - 셋(set)
# - 종복 불가 리스트를 만들 때 사용

print("1-------------------------")

# 셋 만들기
l1 = [1, 2, 3, 2, 4, 3]
s1 = {1, 2, 3, 2, 4, 3}

print(l1)
print(s1)

# set() 클래스를 사용하여 리스트로부터 셋을 만들기
s2 = set(l1)
print(s2)

print("2-------------------------")

# 셋에 추가하기
s3 = {1, 2, 3}
s3.add(4)
print(s3)

# 셋에 다른 셋의 값을 추가하기
s3.update({5, 6, 7})
print(s3)

# 셋에 있는 값 제거
s3.remove(2) # 파라미터로 삭제할 값을 지정한다.
print(s3)

# 셋 비우기
s3.clear()
print(s3)

print("3-------------------------")

s1 = {1, 2, 3, 4, 5, 6}
s2 = {4, 5, 6, 7, 8, 9}

# 합집합
print(s1 | s2)

# 교집합
print(s1 & s2)

# 차집합
print(s1 - s2)




