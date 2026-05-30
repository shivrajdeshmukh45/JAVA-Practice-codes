class UserMainCode(object):
    @classmethod
    def weightedScore(cls, input1, input2, input3):
        n = input1
        prefix_score = [0] * (n + 1)
        prefix_weight = [0] * (n + 1)
        for i in range(n):
            prefix_score[i+1] = prefix_score[i] + input2[i] * input3[i]
            prefix_weight[i+1] = prefix_weight[i] + input3[i]
        max_avg = float('-inf')
        for i in range(n):
            for j in range(i+2, n+1):
                score_sum = prefix_score[j] - prefix_score[i]
                weight_sum = prefix_weight[j] - prefix_weight[i]
                avg = score_sum / weight_sum
                if avg > max_avg:
                    max_avg = avg
        return round(max_avg, 2)