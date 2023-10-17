# programmers

  
## List
Character[] array = list.toArray(new Character[list.size()]);  
  
int[] arr = list.stream().mapToInt(Integer::intValue).toArray();  
  
## 정렬  
Collections.sort(list);  
Collections.sort(list, Collections.reverseOrder());  
Collections.min(list);  
Collections.max(list);  

## stack
.push() // 값 추가  
.pop() // 가장 산단의 값 출력 후 삭제  
.peek() // 가장 상단의 값 출력  
.clear() // 전체 값 제거  
.contains() // 포함여부  
.size() // 크기  
.isEmpty()  
  
## Math
Math.min()  
Math.max()  
Math.sqrt() // 제곱수  
