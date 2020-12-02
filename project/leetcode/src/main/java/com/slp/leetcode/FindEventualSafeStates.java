package com.slp.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FindEventualSafeStates
 * @Description 在有向图中, 我们从某个节点和每个转向处开始, 沿着图的有向边走。 如果我们到达的节点是终点 (即它没有连出的有向边), 我们停止。
 *
 * 现在, 如果我们最后能走到终点，那么我们的起始节点是最终安全的。 更具体地说, 存在一个自然数 K,  无论选择从哪里开始行走, 我们走了不到 K 步后必能停止在一个终点。
 *
 * 哪些节点最终是安全的？ 结果返回一个有序的数组。
 *
 * 该有向图有 N 个节点，标签为 0, 1, ..., N-1, 其中 N 是 graph 的节点数.  图以以下的形式给出: graph[i] 是节点 j 的一个列表，满足 (i, j) 是图的一条有向边。
 *
 * 示例：
 * 输入：graph = [[1,2],[2,3],[5],[0],[5],[],[]]
 * 输出：[2,4,5,6]
 * 这里是上图的示意图。
 *
 *
 * @Author sanglp
 * @Date 2020/11/6 11:00
 * @Version 1.0
 *
 **/
public class FindEventualSafeStates {

    public static void main(String[] args) {
        int[][] graph = new int [7][];
        graph[0] = new int []{1,2};
        graph[0] = new int []{2,3};
        graph[0] = new int []{5};
        graph[0] = new int []{0};
        graph[0] = new int []{5};
        graph[0] = new int []{};
        graph[0] = new int []{};
        eventualSafeNodes(graph);
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<Integer>();//记录结果
        int n = graph.length;//长度
        int[] type = new int[n];//访问类型
        for ( int i = 0; i < n; i++ ) {
            if ( DFS(graph, i, type) == 2 ) ans.add(i);
        }
        return ans;
    }

    public static int DFS( int[][] graph, int index, int[] type ) {
        if ( type[index] == 1 ) return 3;//如果访问过了，说明成环
        if ( type[index] != 0 ) return type[index];	//如果不是0，返回自身
        type[index] = 1;//标记访问了
        for (int i : graph[index]) {
            if ( DFS(graph, i, type) == 3 ) {
                type[i] = 3;
                return 3;
            }
        }

        type[index] = 2;//不成环
        return 2;
    }
}
