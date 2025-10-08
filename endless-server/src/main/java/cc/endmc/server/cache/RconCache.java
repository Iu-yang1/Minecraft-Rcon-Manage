package cc.endmc.server.cache;

import cc.endmc.server.common.rconclient.RconClient;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Map缓存
 * 作者：Memory
 */
public class RconCache {
    // private static final Map<String, RconClient> map = new HashMap<>();
    private static final ConcurrentHashMap<String, RconClient> map = new ConcurrentHashMap<>();

    public static void put(String key, RconClient value) {
        map.put(key, value);
    }

    public static RconClient get(String key) {
        return map.get(key);
    }

    public static void remove(String key) {
        if (map.containsKey(key)) {
            RconClient client = map.get(key);
            if (client != null) {
                client.close();
            }
            map.remove(key);
        }
    }

    public static void close(String key) {
        if (map.containsKey(key)) {
            RconClient client = map.get(key);
            if (client != null) {
                client.close();
            }
        }
    }

    public static void clear() {
        if (!map.isEmpty()) {
            for (RconClient client : map.values()) {
                if (client != null) {
                    client.close();
                }
            }
        }
        map.clear();
    }

    public static boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public static boolean containsValue(RconClient value) {
        return map.containsValue(value);
    }

    public static int size() {
        return map.size();
    }

    public static boolean isEmpty() {
        return map.isEmpty();
    }

    public static Map<String, RconClient> getMap() {
        return map;
    }

}
