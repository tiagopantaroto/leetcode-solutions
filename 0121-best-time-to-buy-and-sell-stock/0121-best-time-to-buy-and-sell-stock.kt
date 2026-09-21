class Solution {
        fun maxProfit(prices: IntArray): Int {
        var maximumProfit: Int = 0
        var currentProfit: Int = 0
        var minValue: Int = prices[0]
        var i = 1
        while (i < prices.size) {

            currentProfit = prices[i] - minValue

            if (maximumProfit < currentProfit)
                maximumProfit = currentProfit

            if (minValue > prices[i])
                minValue = prices[i]

            i++
        }

        return maximumProfit

    }
}