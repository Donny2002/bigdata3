# 컬렉션 - 딕셔너리(dictionary) II
# - 개념은 자바의 Map과 같다
# - 코드 문법은 자바스크립트의 객체 표기법과 유사하다.
# - value를 저장할 때 key를 사용한다.

print("1------------------------------")

# 딕셔너리에 리스트 담기
scoreDic = {
    "홍길동": [100, 100, 100],
    "임꺽정": [90, 90, 90],
    "유관순": [80, 80, 80],
    }

print("%s = %d" % ("홍길동", sum(scoreDic["홍길동"])))

print("2------------------------------")

# 딕셔너리에 튜플 담기

scoreDic = {
    "홍길동": (100, 100, 100),
    "임꺽정": (90, 90, 90),
    "유관순": (80, 80, 80),
    }

print("%s = %d" % ("홍길동", sum(scoreDic["홍길동"])))

print("3------------------------------")

# 딕셔너리에 딕셔너리 담기
scoreDic = {
    '홍길동' : {'kor': 100, 'eng': 100, 'math': 100},
    '임꺽정' : {'kor': 90, 'eng': 90, 'math': 90},
    '유관순' : {'kor': 80, 'eng': 80, 'math': 80},
    }

print(scoreDic['임꺽정']['math'])

print("4------------------------------")

# dict() 클래스를 사용하여 딕셔너리 만들기
scoreDic = dict(kor=100, eng=90, math=80)
print(scoreDic)
print(scoreDic['eng'])

scoreDic = dict(홍길동=[100,100,100], 임꺽정=[90,90,90])
print(scoreDic)

print("5------------------------------")

# dict() 클래스를 사용하여 리스트를 딕셔너리로 만들기
arr = [('홍길동',[100,100,100]), 
       ('임꺽정',[90,90,90]),
       ('유관순',[80,80,80])]
scoreDic = dict(arr)
print(scoreDic)

print("6------------------------------")

# 딕셔너리 값을 한꺼번에 변경하기
scoreDic.update({'유관순':[85,90,97], '임꺽정':[95,96,97]})
print(scoreDic)

print("7------------------------------")

# 딕셔너리 값 지우기
scoreDic.clear()
print(scoreDic)


