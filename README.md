# programmers

### HashMap
.containsKey()  
.getOrDefault()  

### String
.toCharArray();

### Queue
.offer()  
.peek()  
.poll()  


### List
Integer[] array = {1, 2, 3, 4};  
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));   
  
Character[] array = list.toArray(new Character[list.size()]);  


## stream
ArrayList<Integer> list = new ArrayList<>(
                Arrays.stream(ingredient).boxed().collect(Collectors.toList())
        );
