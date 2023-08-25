# programmers

## HashMap
.containsKey()  
.getOrDefault()  

## String
.toCharArray();

## Queue
.offer()  
.peek()  
.poll()  


## List
Integer[] array = {1, 2, 3, 4};  
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));   
  
Character[] array = list.toArray(new Character[list.size()]);  


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
