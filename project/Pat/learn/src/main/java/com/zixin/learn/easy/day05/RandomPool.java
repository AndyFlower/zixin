package com.zixin.learn.easy.day05;

import java.util.HashMap;

/**
 * 
 * @ClassName: RandomPool
 * @Description: 完整的 RandomPool 结构
 * @author Administrator
 * @date 2020-03-22 18:21:14
 */
public class RandomPool {

    public static class Pool<K> {
        private HashMap<K, Integer> keyIndexMap;
        private HashMap<Integer, K> indexKeyMap;
        private int size;

        public Pool() {
            this.keyIndexMap = new HashMap<K, Integer>();
            this.indexKeyMap = new HashMap<Integer, K>();
            this.size = 0;
        }

        public void insert(K key) {
            if (!keyIndexMap.containsKey(key)) {
                keyIndexMap.put(key, size);
                indexKeyMap.put(size++, key);
            }
        }
        /**
         * 
         * @Title: delete
         * @Description: 删除的时候如果是中间的 不要删除以免出现空缺  将最后一个移动到删除的地方覆盖  然后修改长度就可以
         * @author Administrator
         * @date 2020-03-22 18:22:50
         * @param @param key 参数
         * @return void 返回类型
         * @throws
         */
        public void delete(K key) {
            if (keyIndexMap.containsKey(key)) {
                int deleteIndex = keyIndexMap.get(key);
                // 因为 index 从 0 开始，所以 lastIndex = --size
                int lastIndex = --size;
                // 将最后一个值放置到刚才删除的 deleteIndex 上面，然后删除 lastIndex。
                K lastKey = indexKeyMap.get(lastIndex);
                keyIndexMap.put(lastKey, deleteIndex);
                indexKeyMap.put(deleteIndex, lastKey);
                keyIndexMap.remove(key);
                indexKeyMap.remove(lastIndex);
            }
        }

        public K getRandom() {
            if (this.size == 0) {
                return null;
            }
            int randomIndex = (int) (Math.random() * this.size); // 0 ~ size -1
            return indexKeyMap.get(randomIndex);
        }
    }

    public static void main(String[] args) {
        Pool<String> pool = new Pool<String>();
        pool.insert("zhangsan");
        pool.insert("lisi");
        pool.insert("wangwu");
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
    }
}
