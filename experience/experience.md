### 基本类型数组自定义排序规则 && 和 List 互转

```java
int[] array = new int[] {1, 2, 3};

// 升序则无需转化为 List<Integer>
Arrays.sort(array);

// int[] 转换为 List<Integer>
List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

// 通过 Collections 排序
Collections.sort(array, (a, b) -> Integer.compare(a, b));

// 通过 List 排序
list.sort((a, b) -> Integer.compare(a, b));

// 反转
Collections.reverse(list);

// List<Integer> 转换为 int[]
int[] array = list.stream().mapToInt(i -> i).toArray();
```



### 引用类型数组自定义排序规则

```java
String[] array = new String[] {"apple", "banana", "cat"};

Arrays.sort(array, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
```



### Array 和 List 互转（引用类型）

```java
// Array to List
Integer[] array = new Integer[] {1, 2, 3};
List<Integer> list = Arrays.asList(array);
List<Integer> list = new ArrayList<>(Arrays.asList(array));

// list to array
List<Integer> list = Arrays.asList(1, 2, 3);
Integer[] array = list.toArray(new Integer[0]);

// List<int[]> to array
List<int[]> list = new LinkedList<>();
int[][] array = list.toArray(new int[0][]);
```

















