package data.structure.introduction;

/**
 * Created by hbl on 2020/8/30.
 * this class is for the basic introduce for data structure and algorithm
 *
 * point 1.
 *
 *  数据结构= 算法+代码 （算法说的是解决问题的思路和方法），数据结构又包括逻辑结构和存储结构两个层次
 *
 *  1. 逻辑结构(线性结构和非线性结构，以下除了线性结构都是非线性结构)
 *   集合结构 *   树结构 *   图结构或网状结构 （树、二叉树、有向图、无向图）
 *   线性结构 （线性表、栈和队列、字符串、数组、广义表）

 *  2. 存储结构
 *   顺序存储结构
 *   链式存储结构
 *
 * point 2.
 *
 *  评价算法优劣的标准 （时间+空间）
 *   正确性、可读性、健壮性、 高效性
 *
 *  1.算法的时间复杂度
 *    * 常量阶  - 算法的执行时间是一个与问题规模n无关的常数  - T(n)=O(1)
 *      {x++;s=0}
 *      for(i=0;i<10000;i++){x++;s=0;}
 *    * 线性阶 - f(n) = n     -                                T(n)=O(n)
 *      for(i=0;i<n;i++){x++;s=0;}\
 *    * 平方阶 - 对循环语句只需考虑循环体中语句的执行次数，以下程序段中频段中频度最大的语句是y++，  T(n)=O(n*n)
 *      x=0;y=0;
 *      for(k=1;k<=n;k++)
 *          x++;
 *      for(i=1;i<=n;i++)
 *        for(j=1;j<=n;j++)
 *            y++;
 *    * 立方阶                                                T(n)=O(n*n*n)
 *      x=1;
 *      for(i=1;i<=n;i++)
 *        for(j=1;j<=n;j++)
 *          for(k=1;k<n;k++)
 *             x++
 *  2.算法的空间复杂度
 *
 */

public class BasicIntroduce {

}
