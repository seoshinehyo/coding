def solution(my_string, n):
    list_str = list(my_string)
    answer = ''.join(list_str[-n:])
    return answer