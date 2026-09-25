import java.util.*;
class SchoolarShip{
    public static int assign(int[]need,int[]amount){
        Arrays.sort(need);
        Arrays.sort(amount);
        int m=need.length;
        int n=amount.length;
        int count=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(need[i]<=amount[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int[]need={2,3,4};
        int[]amount={1,3,5};
        System.out.println("The count od students recived money are: "+assign(need, amount)); 
    }
}
/* # Maximum Number of Students Who Can Receive a Suitable Scholarship

You are organizing a scholarship program for students.

Each student `i` has a **minimum scholarship amount** `need[i]` that they require in order to accept the scholarship.

You have several scholarship offers, where each offer `j` has an **amount** `amount[j]`.

Each student can receive **at most one scholarship**, and each scholarship offer can be given to **at most one student**.

A student will accept a scholarship if:

```text
amount[j] >= need[i]
```

Your goal is to **maximize the number of students who receive a suitable scholarship**.

Return the maximum number of students who can receive scholarships.

### Example 1

```text
Input: need = [1,2,3], amount = [1,1]

Output: 1
```

### Explanation

There are 3 students whose minimum requirements are:

```text
1, 2, 3
```

There are 2 scholarship offers:

```text
1, 1
```

Only a student requiring `1` can accept one of these offers.

Therefore, the maximum number of students who can receive scholarships is:

```text
1
```

---

### Example 2

```text
Input: need = [1,2], amount = [1,2,3]

Output: 2
```

### Explanation

The students require:

```text
1, 2
```

The scholarship amounts are:

```text
1, 2, 3
```

We can assign:

```text
Student requiring 1 ← Scholarship 1
Student requiring 2 ← Scholarship 2
```

Therefore, both students can receive suitable scholarships.

```text
Output: 2
```

---

### Example 3

```text
Input: need = [2,3,4], amount = [1,3,5]

Output: 2
```

### Explanation

We can assign:

```text
Student requiring 2 ← Scholarship 3
Student requiring 3 ← Scholarship 5
```

The scholarship of amount `1` cannot satisfy either remaining student.

Therefore:

```text
Output: 2
```

---

### Constraints

```text
1 <= need.length <= 3 * 10^4
0 <= amount.length <= 3 * 10^4
1 <= need[i], amount[j] <= 2^31 - 1
```

### Expected Topic

* Arrays
* Sorting
* Two Pointers
* Greedy
*/
