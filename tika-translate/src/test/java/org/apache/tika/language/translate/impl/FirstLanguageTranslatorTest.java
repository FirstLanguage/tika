/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.language.translate.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.apache.tika.language.translate.impl.FirstLanguageTranslator;

public class FirstLanguageTranslatorTest {

  FirstLanguageTranslator translator;

  @Before
  public void setUp() {
    translator = new FirstLanguageTranslator();
  }

  @Test
  public void testSimpleSpanishToEnglishTranslation() throws Exception {
    String source = "Today is a good day";
    String expected = "இன்று நல்ல நாள்.";
    String translated = translator.translate(source, "en", "ta");
    if (translator.isAvailable()) assertTrue("Translate " + source + " to " + expected + " (was " + translated + ")",
        expected.equalsIgnoreCase(translated));
  }
}
