package codewars

import spock.lang.Specification

/**
 * Created by murahige on 19/01/02.
 */
class DiamondTest extends Specification {
    def test(){
        setup:
        def sut = new Diamond()

        expect:
        sut.print(n) == expected

        where:
        n  | expected
        2  | null
        -1 | null
        3  | " *\n***\n *\n"
        5  | "  *\n ***\n*****\n ***\n  *\n"

    }
}
