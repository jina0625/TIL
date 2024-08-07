# 주소록 프로그램 만들기
phoneBook = {}

def printMenu():
    print("1. 추가하기")
    print("2. 수정하기")
    print("3. 삭제하기")
    print("4. 목록보기")
    print("5. 종료하기")

def inputMenu():
    return input("선택메뉴 : ")

def addBook():
    name = input("이름 : ")
    phone = input("전화번호 : ")
    phoneBook[name] = phone
    print(phoneBook.items())
        
def editBook():
    name = input("수정할 이름 : ")
    if name in phoneBook :
        phone = input("전화번호 : ")
        phoneBook[name] = phone
        print(phoneBook.items())
    else :
        print(f"{name}이 존재하지 않습니다.")

def delBook():
    name = input("삭제할 이름 : ")
    if name in phoneBook :
        del phoneBook[name]
    else :
        print(f"{name}이 존재하지 않습니다.")
    print(phoneBook.items())

def viewBook():
    print(phoneBook.items())

while True:
    printMenu()
    ans= inputMenu()

    if ans == "1":
        addBook()
    elif ans == "2":
        editBook()
    elif ans == "3":
        delBook()
    elif ans == "4":
        viewBook()
    elif ans == "5":
        break
    else:
        print("다시 선택하기")
        
print()
      
# 클래스 (class)
#     현실 세계 사물을 컴퓨터 안에서 구현하는 개념
#     특정 객체 (object)를 생성하기 위한 틀 (설계도)
#     변수, 메소드, 생성자
    

# 객체 (object)
#     클래스 생성자 통해 만들어진 객체, 인스턴스 (instance)
#     규모 큰 프로그램일수록 코드 작성과 관리에 유리
#     생성된 객체 속성 : 변수
#     생성된 객체 메소드 : 함수
    
# ex) Car 클래스
#     클래스 정의부
class Car:
    brand = ''
    model = ''
    color = ''
            
    # 객체 생성시 호출하는 (생성자) : _init_()
        # 생성시 자동으로 호출
        # 기본값 넣어줌
        # self.<식별자> 형태로 접근
            # class의 self 의미
                # 생성자의 첫번째 인자
                # 현재 객체가 생성된 객체 중 어던 것인지 지칭하기 위해 self 사용
                # self는 자기 자신의 의미로 자바 this와 유사한 기능
        # 초기화를 속성값을 매개변수로 전달
        
    def __init__(self, brand, model, color):
        self.brand = brand
        self.model = model
        self.color = color
        print(brand, model, color, ' 객체가 생성되었습니다.')

    # 메소드 (클래스 안 함수)
    def turn_on (self):
        print(self.model, '자동차 시동을 겁니다')

    def turn_off (self):
        print(self.model, '자동차 시동을 끕니다')
        
    def drive (self):
        print(self.model, '자동차 주행중입니다')

    def show_info (self):
        print(self.brand, ' ',self.color, ' ', self.model, '자동차입니다')
        
# ex) Car 객체  
    # 객체(인스턴스) = 클래스명()
my_car  = Car("현대", "소나타", "흰색")

my_car.turn_on()
my_car.turn_off()
my_car.drive()

print()

my_car2  = Car("벤츠", "c클래스", "블랙")

my_car2.turn_on()
my_car2.turn_off()
my_car2.drive()

print()

# 객체 정보 확인 팁
    # print(dir((Car)))
    # print(help(my_car))


# 자전거 Bicycle 객체 생성, 사용
class Bicycle :
    wheel_size = ""
    color = ""
    
    def __init__(self, wheel_size, color) :
        self.wheel_size = wheel_size
        self.color = color
        print(self.color, "색 자전거가 생성되었습니다.")
        
    def move(self, speed) :
        print(speed, "속도로 이동합니다.")
        
    def stop(self) :
        print(self.color, "자전거가 멈춥니다.")
        

harry_bicycle = Bicycle(100, "red")

harry_bicycle.move(60)
harry_bicycle.stop()

print()

ron_bicycle = Bicycle(120, "black")

ron_bicycle.move(80)
ron_bicycle.stop()
    


