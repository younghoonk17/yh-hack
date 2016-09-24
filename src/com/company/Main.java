package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner in = new Scanner(new File("C:\\Users\\Yh\\IdeaProjects\\yh-hack\\src\\input"));

        int size_of_input = in.nextInt();
        int run_query_this_many_times = in.nextInt();
        int ask_for_index = in.nextInt();

        int[] input_array = new int[size_of_input];

        for (int i=0; i<size_of_input; i++){
            input_array[i] = in.nextInt();

            //Check what in the input array
            //System.out.print(input_array[i]);
        }


        int[] input_array_answer = new int[size_of_input];



        input_array_answer = iteration(input_array,size_of_input,run_query_this_many_times );


        for(int i=0; i<ask_for_index; i++){
            System.out.println(input_array_answer[in.nextInt()]);
        }


//        for (int i=0; i<size_of_input; i++){
//            System.out.print(input_array_answer[i]);
//        }

    }

    public static int[] iteration( int[] input_array, int size_of_input, int run_query_this_many_times){
        int[] input_array_answer = new int[size_of_input];

        int tmp1 =0;
        int tmp2 =1;

        for (int i=1; i<size_of_input+1; i++){

            if((i%2)==0) {
                input_array_answer[i-1] = input_array[tmp1];
                tmp1++;
            }else{
                input_array_answer[i-1] = input_array[size_of_input-tmp2];
                tmp2++;
            }
        }


        run_query_this_many_times--;
        if(run_query_this_many_times==0){
            return input_array_answer;
        }

        return iteration(input_array_answer, size_of_input, run_query_this_many_times);
    }
}
