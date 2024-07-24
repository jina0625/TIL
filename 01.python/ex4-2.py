# 딕셔너리 (dict) 형
    # 키(key) : 값(value) 쌍을 이뤄 하나의 항목으로 저장
    # 키(key)로 자료에 접근
        # 딕셔너리명 = {key0 : value0, key1 : value1, key2 : value2, ..., keyN : valueN}
user1 = {}
user1["나이"] = 20
user1["이름"] = "홍길동"
user1["전화번호"] = "010-1234-5678"
user1["직업"] = "학생"
user1["취미"] = "자전거타기", "산책"
print(user1)

print()

dict1 = {"홍길동" : 90, "강길동" : 80, "정길동" : 100}
print(dict1)

print()

# 딕셔너리명[key] : 존재하지 않는 키로 추출 시도 시 오류 발생
# 딕셔너리명.get(key) : 존재하지 않는 키로 추출 시도해도 오류 발생X
print("강길동" in dict1)
print("공길동" in dict1)

print()

if "공길동" in dict1 :
    print(dict1["공길동"])
else :
    print("그런 사람 없어요")
    
print()

dict1["강길동"] = 50
print(dict1)
dict1["공길동"] = 50
print(dict1)
del(dict1["강길동"])
print(dict1)
print(dict1.pop("공길동"))
print(dict1)
dict1.clear()
print(dict1)

print()

dict2 = {"홍길동" : 90, "강길동" : 80, "정길동" : 100}
for i in dict2.keys() :
    print(i)
for i in dict2.values() :
    print(i)
for a, b in dict2.items() :
    print(a, b)
    
print()

for a, b in sorted(dict2.items(), reverse=True) :
    print(a, b)
    
print()

# 쇼핑몰 포인트 관리
miles = {}

    # 아이디와 마일리지 빈 딕셔너리에 저장
miles["kim"] = 12000
miles["lee"] = 11000
miles["han"] = 3000
miles["hong"] = 5000
miles["hwang"] = 18000

    # han 마일리지 5000점으로 업데이트
miles["han"] = 5000
print(miles)

    # 아이디 jang 마일리지 7000 추가
miles["jang"] = 7000
print(miles)

    # 딕셔너리에서 가장 높은 마일리지 찾아 출력
print(max(miles.values()))

    # 딕셔너리에서 가장 낮은 마일리지 찾아 출력
print(min(miles.values()))

    # 전체 딕셔너리 출력
print(f"가장 높은 마일리지 : {max(miles.values())}")
print(f"가장 낮은 마일리지 : {min(miles.values())}")
for a, b in miles.items() :
    print(a, ":", b)
    
print()

# 영어 단어 테스트
    # 엔터("")만 입력할 때까지 영어 단어 - 뜻 입력받는 단어장
dict_voc = {}

while True :
    eng = input("영어단어 : ")
    if eng == "" :
        break
    kor = input("뜻(한글) : ")
    dict_voc[eng] = kor
print(dict_voc)    
    
    # 입력 끝나면 단어 테스트 실시하는 프로그램 만들기
    # 입력된 순서대로 테스트 실시, 맞은 개수 계산
score = 0

for english in dict_voc.keys() :
    korean = input(english + "->" )
    if korean == dict_voc[english] :
        score += 1
        
    # 테스트 끝나면 "맞은 개수 / 전체 단어 수" 형태로 결과 출력
print(f"맞은 개수는 {score} / 전체 문제수는 {len(dict_voc.values())}")

print()

# 집합 (set) 형
    # 자료들이 순서와 중복없이 저장
        # 순서 없기 때문에 인덱싱으로 값 얻을 수 x
    # 중괄호{}안에 요소를 쉼표로 구분하여 나열
        # 집합명 = {value1, value2, ..., valueN}
setdata = {"홍길동", "강길동", "정길동", "최길동", "홍길동"}
print(setdata)

print()

set1 = {"사과", "배", "감"}
set1.add("오렌지")
set1.update(["딸기", "한라봉"])
print(set1)
set1.remove("오렌지")
print(set1)


# 편의점 재고관리
# 엔터('')만 입력할 때까지 반복하여 사용자로부터 물건 이름과 개수 입력 받기
# 물건 이름 존재하지 않으면 추가하고, 존재하면 물건 개수 더함
inventory={}

while True :
    name = input("물건 이름 : ")
    if name == "" :
        break
    number = int(input("개수 : "))
    if name in inventory.keys() :
        number += inventory[name]
    inventory[name] = number
print(inventory)
# 입력 끝나면 재고 현황을 물건 이름 오름차순으로 정렬하여 출력
print(sorted(inventory.items()))


