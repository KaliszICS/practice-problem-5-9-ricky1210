import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

    // ─────────────────────────────────────────────
    //  processBackspaces
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("processBackspaces - Example from instructions: abc#d##c → ac")
    void processBackspacesTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("ac", (String) method.invoke(null, "abc#d##c"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - No backspaces: hello → hello")
    void processBackspacesTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("hello", (String) method.invoke(null, "hello"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - All backspaces erase everything: abc### → \"\"")
    void processBackspacesTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("", (String) method.invoke(null, "abc###"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - Empty string returns empty string")
    void processBackspacesTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("", (String) method.invoke(null, ""));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - Single character, no backspace: a → a")
    void processBackspacesTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("a", (String) method.invoke(null, "a"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - Single character then backspace: a# → \"\"")
    void processBackspacesTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("", (String) method.invoke(null, "a#"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - Backspace in the middle: ab#c → ac")
    void processBackspacesTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("ac", (String) method.invoke(null, "ab#c"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - Consecutive backspaces: abcd## → ab")
    void processBackspacesTest8() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            assertEquals("ab", (String) method.invoke(null, "abcd##"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("processBackspaces - More backspaces than characters: a###b# → \"\"")
    void processBackspacesTest9() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("processBackspaces", cArg);
            // 'a' is pushed, then ### tries to pop 3 times but stack empties after first pop
            // 'b' is pushed, then # pops it — result is empty
            assertEquals("", (String) method.invoke(null, "a###b#"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    //  simulateLine
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("simulateLine - Example from instructions: final state is [Bob, Alice]")
    void simulateLineTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "VIP Charlie",
                "SERVE",
                "REQUEUE",
                "ENQUEUE David",
                "SCARE"
            };
            // Expected: front-to-back order as a String, e.g. "[Bob, Alice]"
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Bob, Alice]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - Only ENQUEUE commands: [Alice, Bob, Charlie]")
    void simulateLineTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "ENQUEUE Charlie"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Alice, Bob, Charlie]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - VIP goes to front: [VIP, Alice, Bob]")
    void simulateLineTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "VIP Zara"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Zara, Alice, Bob]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - SERVE removes person from front: [Bob, Charlie]")
    void simulateLineTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "ENQUEUE Charlie",
                "SERVE"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Bob, Charlie]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - REQUEUE moves front to back: [Bob, Charlie, Alice]")
    void simulateLineTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "ENQUEUE Charlie",
                "REQUEUE"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Bob, Charlie, Alice]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - SCARE removes person from back: [Alice, Bob]")
    void simulateLineTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "ENQUEUE Charlie",
                "SCARE"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Alice, Bob]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - SERVE all guests leaves empty line: []")
    void simulateLineTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "ENQUEUE Bob",
                "SERVE",
                "SERVE"
            };
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("simulateLine - Multiple VIPs: last VIP is at the very front")
    void simulateLineTest8() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String[].class };
            Method method = testClass.getDeclaredMethod("simulateLine", cArg);
            String[] cmds = {
                "ENQUEUE Alice",
                "VIP Bob",
                "VIP Charlie"
            };
            // Charlie arrives last as VIP, so Charlie is front, then Bob, then Alice
            String result = (String) method.invoke(null, (Object) cmds);
            assertEquals("[Charlie, Bob, Alice]", result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}
