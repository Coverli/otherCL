using System.Collections.Generic;

namespace HumphreyJ.BF
{
    public class Brainfuck
    {
        public static string eval(string code, string input)
        {
            string output = "";

            int pointer_code = 0;
            int pointer_input = 0;
            int pointer_output = 0;

            Stack<int> stack = new Stack<int>();

            //char array[infinitely large size] = {0};
            List<char> array = new List<char> { '\0' };

            //char* ptr = array;
            int ptr = 0;

            while (pointer_code < code.Length)
            {
                switch (code[pointer_code])
                {
                    case '>':
                        {
                            //++ptr;
                            ++ptr;
                            break;
                        }
                    case '<':
                        {
                            //--ptr;
                            --ptr;
                            break;
                        }
                    case '+':
                        {
                            //++*ptr;
                            if (array.Count == ptr)
                            {
                                array.Add('\0');
                            }
                            ++array[ptr];
                            break;
                        }
                    case '-':
                        {
                            //--*ptr; 
                            if (array.Count == ptr)
                            {
                                array.Add('\0');
                            }
                            --array[ptr];
                            break;
                        }
                    case '.':
                        {
                            //putchar(*ptr);
                            output += array[ptr];
                            pointer_output++;
                            break;
                        }
                    case ',':
                        {
                            //*ptr = getchar();
                            array[ptr] = input[pointer_input++];
                            break;
                        }
                    case '[':
                        {
                            //while (*ptr) {
                            if (array[ptr] != 0)
                            {
                                stack.Push(pointer_code);
                            }
                            else
                            {
                                int s = 1;
                                while (s > 0)
                                {
                                    pointer_code++;
                                    switch (code[pointer_code])
                                    {
                                        case '[':
                                            {
                                                s++;
                                                break;
                                            }
                                        case ']':
                                            {
                                                s--;
                                                break;
                                            }
                                    }
                                }
                            }
                            break;
                        }
                    case ']':
                        {
                            //}
                            pointer_code = stack.Pop() - 1;
                            break;
                        }
                }
                pointer_code++;
            }
            return output;
        }
    }
}