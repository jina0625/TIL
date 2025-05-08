import networkx as nx

def min_cost_communication(languages):
    n = len(languages)
    G = nx.Graph()

    # 노드 추가
    for i in range(n):
        G.add_node(i)

    # 간선 추가 (같은 언어를 아는 경우)
    for i in range(n):
        for j in range(i+1, n):
            if any(languages[i][k] & languages[j][k] for k in range(4)):
                G.add_edge(i, j)

    # 최소 절단 계산
    cut_value, partition = nx.minimum_cut(G, 0, list(range(1, n)))

    return cut_value

# 예시 실행
languages1 = [(1,0,0,0),(0,1,0,0),(1,1,0,0)]
languages2 = [(0,0,1,0),(0,0,1,1),(0,0,0,0),(0,0,0,0)]

print(min_cost_communication(languages1))
print(min_cost_communication(languages2))