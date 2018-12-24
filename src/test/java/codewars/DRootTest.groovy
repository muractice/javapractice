package codewars

import spock.lang.Specification

/**
 * Created by murahige on 18/12/24.
 */
class DRootTest extends Specification {
    def test(){
        setup:
        def sut = new DRoot()

        expect:
        sut.digital_root(n) == expect

        where:
        n  || expect
        16  || 7
        456 || 6
    }
}
