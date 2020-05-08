'''
Quiz - 7 (AlgoMania)
Input: An integer Array
'''

from sys import stdin,stdout

def arrange_tree(a, i, tree, support_list):
    current = len(tree) - 1
    k = tree[current]

    while current > 0:
        j = i - support_list[k]
        if (a[j] > a[i] and
            (k < 2 or a[j] > a[i-1] and a[j] > a[i-2])):
            a[i], a[j] = a[j], a[i]
            i = j
            current -= 1
            k = tree[current]
        else:
            break

    while k >= 2:
        p, q, r, s = small_trees(i, k, support_list)
        if a[i] < a[p] or a[i] < a[r]:
            if a[p] > a[r]:
                a[i], a[p] = a[p], a[i]
                i, k = p, q
            else:
                a[i], a[r] = a[r], a[i]
                i, k = r, s
        else:
            break

def small_trees(i, k, support_list):
    p, q = i - 1, k - 2
    r, s = p - support_list[q], k - 1
    return p, q, r, s



def sub_algo(n):

    a, b = 1, 1
    ans = []
    while a <= n:
        ans.append(a)
        a, b = b, a + b + 1
    return ans


def algo(a):
    n = len(a)
    support_list = sub_algo(n)
    tree = []

    for i in range(n):
        if len(tree) >= 2 and tree[-2] == tree[-1] + 1:
            tree.pop()
            tree[-1] += 1
        else:
            if len(tree) >= 1 and tree[-1] == 1:
                tree.append(0)
            else:
                tree.append(1)
        arrange_tree(a, i, tree, support_list)

    for i in reversed(range(n)):
        if tree[-1] < 2:
            tree.pop()
        else:
            k = tree.pop()
            p, q, r, s = small_trees(i, k, support_list)
            tree.append(s)
            arrange_tree(a, r, tree, support_list)
            tree.append(q)
            arrange_tree(a, p, tree, support_list)
    return a

arr = list(map(int, stdin.readline().strip().split()))
arr = algo(arr)
for num in arr:
    stdout.write(str(num)+' ')
stdout.write('\n')