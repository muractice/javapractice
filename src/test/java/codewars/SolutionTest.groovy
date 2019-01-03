package codewars

import spock.lang.Specification

/**
 * Created by murahige on 19/01/03.
 */
class SolutionTest extends Specification {
    def test(){
        setup:
        def sut = new Solution()

        expect:
        sut.whoLikesIt(s) == expected

        where:
        s                                        | expected
        ""                                       | "no one likes this"
        "Peter"                                  | "Peter likes this"
        """Jacob","Alex"""            | "Jacob and Alex like this"
    }
}
