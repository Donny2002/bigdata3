# 컬렉션 - 튜플(tuple)
# 튜플? 
# - immutable list
# - 리스트의 항목을 변경할 수 없는 리스트 
print("1----------------------------------")

# 튜플 정의
l1 = [1, 2, 3]
t1 = (1, 2, 3)

print(l1)
print(t1)

print("2----------------------------------")

# 튜플 값 꺼내기
print(l1[1])
print(t1[2])

print(l1[-1])
print(t1[-1])

print("2----------------------------------")

# 튜플 값 변경
l1[0] = 100
print(l1)

#t1[0] = 100 # 오류! 변경 불가.
#print(t1)

print("3----------------------------------")

# 항목 한 개짜리 튜플 만들기
l2 = [100]
print(l2)

t2 = (100) # 일반 괄호이기 때문에 t2는 그냥 100을 저장
print(t2)

t2 = (100,) # 값이 한 개 밖에 없더라도 콤마를 찍는다.
print(t2)

print("4----------------------------------")

# 튜플 값 복제
t = (1, 2, 3, 4, 5, 6, 7, 8, 9)
t2 = t[2:5]
print(t2)

# 튜플 값 병합
t1 = (1, 2, 3)
t2 = (4, 5, 6)
t3 = t1 + t2
print(t3)

print("5----------------------------------")

# 튜플 값을 여러 변수에 저장하기
t = ("홍길동", 20, "1111-1111", "hong@test.com", False)
print(t)

name, age, tel, email, working = t
print(name, age, tel, email, working)

# 변수의 개수와 튜플의 값 개수가 맞지 않으면 오류!
#name, age, tel, email = t
#print(name, age, tel, email)

print("6----------------------------------")
t1 = ("홍길동", 20, True)
t1 = ("임꺽정", 30, False)
print(t1)









