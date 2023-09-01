# programmers

## HashMap
.containsKey()  
.getOrDefault()  

## String
.toCharArray();
.split("[.]");  
.split("\\.");  
.toLowerCase();
  
## Character
Character.getNumericValue();  

  
## StringBuilder
.insert(int index, String str); // 특정 자리에 특정 문자열 삽입  

## Integer
Integer.parseInt(String s, int radix) // s문자열을 radix진수로 변경하여 형변환  
  
## Queue
.offer()  
.peek()  
.poll()  


## List
Integer[] array = {1, 2, 3, 4};  
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));   
  
Character[] array = list.toArray(new Character[list.size()]);  
  
int[] arr = list.stream().mapToInt(Integer::intValue).toArray();  
  
// 정렬  
Collections.sort(list);  
Collections.sort(list, Collections.reverseOrder());  
  
## stream
ArrayList<Integer> list = new ArrayList<>(
                Arrays.stream(ingredient).boxed().collect(Collectors.toList())
        );

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
