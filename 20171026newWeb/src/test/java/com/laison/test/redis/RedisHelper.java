/*package com.laison.test.redis;
public class RedisHelper
    {
        public RedisClient client = new RedisClient("127.0.0.1", 6379);
        public void Set<T>(string key, T val)
        {
            client.Set(key, val);
        }
        public T Get<T>(string key)
        {
            var result = client.Get<T>(key);
            return result;
        }
        public IDisposable Acquire(string key)
        {
           return  client.AcquireLock(key);
        }
    }*/