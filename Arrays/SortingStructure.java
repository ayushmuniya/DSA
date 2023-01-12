import java.util.*;

class Student {
    int id;
    String name;
    int marks[] = new int[5];
    int total;

    public Student(int id, String name, int marks[]) {
        this.id = id;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }
}

class MarksSort 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student arr[] = new Student[n];

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int marks[] = new int[5];

            for (int j = 0; j < 5; j++)
                marks[j] = sc.nextInt();
            arr[i] = new Student(id, name, marks);
        }

        int res[] = marksSort(n, arr);

        for (int j : res) {
            System.out.print(j + " ");
        }
    }

    static int[] marksSort(int n, Student arr[]) 
    {
    //calculating total marks for each student
        for (int i = 0; i < n; i++) 
        {
            int total = 0;
            for (int mark : arr[i].marks) 
            {
                total += mark;
            }
            arr[i].total = total;
        }
    // sorting the students based on the problem's conditions
        Arrays.sort(arr, new Comparator<Student>() 
        {
            @Override
            public int compare(Student s1, Student s2) 
            {
                if (s1.total != s2.total) 
                {
                    return s2.total - s1.total;
                }

                int nameComparison = s1.name.compareTo(s2.name);
                if (nameComparison != 0) 
                {
                    return nameComparison;
                }
                return s1.id - s2.id;
            }
    });

            int[] result = new int[n];
            for (int i = 0; i < n; i++) 
            {
                result[i] = arr[i].id;
            }
            return result;
    }
}
