package CodeSnippets.Filter;

public interface Matcher<T> {
    public abstract boolean matches(T t);
}
