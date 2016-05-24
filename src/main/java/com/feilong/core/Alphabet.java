/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core;

/**
 * 常用字母表.
 *
 * @author feilong
 * @version 1.5.3 2016年3月31日 上午12:01:19
 * @see <a href="http://algs4.cs.princeton.edu/50strings/Alphabet.java.html">Alphabet.java</a>
 * @since 1.5.3
 */
public final class Alphabet{

    /** 二进制字符 The binary alphabet { 0, 1 }. */
    public static final String BINARY                                        = "01";

    /** 八进制The octal alphabet { 0, 1, 2, 3, 4, 5, 6, 7 }. */
    public static final String OCTAL                                         = "01234567";

    /** 数字The decimal alphabet { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }. */
    public static final String DECIMAL                                       = "0123456789";

    /** 十六进制The hexadecimal alphabet { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F }. */
    public static final String HEXADECIMAL                                   = "0123456789ABCDEF";

    /** 小写字母The lowercase alphabet { a, b, c, ..., z }. */
    public static final String LOWERCASE                                     = "abcdefghijklmnopqrstuvwxyz";

    /** 大写字母 The uppercase alphabet { A, B, C, ..., Z }. */
    public static final String UPPERCASE                                     = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * 数字和所有的字母.
     * 
     * @see org.apache.commons.lang3.RandomStringUtils#randomAlphanumeric(int)
     */
    public static final String DECIMAL_AND_LETTERS                           = UPPERCASE + LOWERCASE + DECIMAL;

    /** The base-64 alphabet (64 characters). */
    public static final String BASE64                                        = DECIMAL_AND_LETTERS + "+/";

    /**
     * 数字和小写的字母,剔除一些难以辨别的数字和字母.
     * 
     * <p>
     * 通常用于创建随机数验证码,{@link com.feilong.core.util.RandomUtil#createRandomFromString(String, int)}
     * </p>
     * 
     * <p>
     * 剔除了以下数字/字母:
     * <ul>
     * <li>数字 1 和 字母 l</li>
     * <li>数字 0 和 字母 o</li>
     * </ul>
     * </p>
     * 
     * <p>
     * 返回 :23456789abcdefghijkmnpqrstuvwxyz
     * </p>
     * 
     * @see com.feilong.core.util.RandomUtil#createRandomFromString(String, int)
     * @see com.feilong.core.util.RandomUtil#createRandomFromString(String, int, int)
     */
    public static final String DECIMAL_AND_LOWERCASE_LETTERS_DISTINGUISHABLE = "23456789abcdefghijkmnpqrstuvwxyz";

    /** Don't let anyone instantiate this class. */
    private Alphabet(){
        //AssertionError不是必须的. 但它可以避免不小心在类的内部调用构造器. 保证该类在任何情况下都不会被实例化.
        //see 《Effective Java》 2nd
        throw new AssertionError("No " + getClass().getName() + " instances for you!");
    }
}
