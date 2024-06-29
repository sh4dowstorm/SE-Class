package ku.cs.modules;

import java.util.Objects;

public class Square {
    private String name;

    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

/**
 * 6510450216 Khanisorn Srisawang
 */