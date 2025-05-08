
import heapq

def max_revenue(seats, k):
    # 빈 좌석 수를 기준으로 내림차순 정렬된 우선순위 큐 생성
    heap = [(-seat, i) for i, seat in enumerate(seats)]
    heapq.heapify(heap)

    total_revenue = 0
    for _ in range(k):
        # 가장 많은 빈 좌석을 가진 버스 선택
        _, bus_index = heapq.heappop(heap)
        # 빈 좌석 수 감소 및 수익 누적
        seats[bus_index] -= 1
        total_revenue -= seats[bus_index]
        # 빈 좌석 수가 남아있으면 다시 우선순위 큐에 추가
        if seats[bus_index] > 0:
            heapq.heappush(heap, (-seats[bus_index], bus_index))

    return total_revenue

# 문제 3번
N = 7
k = 8
seats = [1,5,5,4,3,3,3]
result = max_revenue(seats, k)
print("문제 3번의 최대 수익:", result)

# 문제 4번
N = 9
k = 12
seats = [6,4,4,4,3,5,5,2,2]
result = max_revenue(seats, k)
print("문제 4번의 최대 수익:", result)

# 문제 5번
N = 12
k = 16
seats = [2,5,2,5,6,2,5,5,3,4,4,7]
result = max_revenue(seats, k)
print("문제 5번의 최대 수익:", result)


def calculate_unhappiness(sequence):
    unhappiness = 0
    for i in range(1, len(sequence)):
        if sequence[i] != sequence[i-1]:
            unhappiness += 1
    return unhappiness

def min_unhappiness(sequence):
    min_unhappiness = float('inf')
    for value in set(sequence):
        new_sequence = [num for num in sequence if num != value]
        unhappiness = calculate_unhappiness(new_sequence)
        min_unhappiness = min(min_unhappiness, unhappiness)
    return min_unhappiness

# 문제 1-5의 입력 데이터
problems = [
    [2, 3, 1, 1, 3],
    [3, 1, 2, 2, 3, 1],
    [2, 1, 3, 1, 2, 3, 1, 2],
    [3, 2, 4, 1, 4, 4, 2, 2, 3, 2],
    [1, 3, 4, 2, 3, 1, 2, 3, 4, 2, 2]
]

# 각 문제에 대한 최소 불만족도 계산 및 출력
for i, problem in enumerate(problems):
    result = min_unhappiness(problem)
    print(f"문제 {i+1}의 최소 불만족도: {result}")
    
    
    def max_distance(k, d):
    n = len(k)
    # 로봇을 이동 거리 내림차순으로 정렬
    robots = sorted(enumerate(d), key=lambda x: -x[1])
    # 로봇이 실렸는지 여부를 저장하는 배열
    loaded = [False] * n

    # 가장 먼 거리를 이동할 수 있는 로봇 선택
    max_idx, max_dist = robots[0]
    loaded[max_idx] = True

    # 선택된 로봇에 최대한 많은 로봇 싣기
    for _ in range(k[max_idx]):
        for i, _ in robots:
            if not loaded[i]:
                max_dist += d[i]
                loaded[i] = True
                break

    return max_dist

# 예시 실행
print(max_distance([2,0,0,1], [2,2,2,1]))
print(max_distance([3,0,1,0,1], [1,2,2,2,3]))