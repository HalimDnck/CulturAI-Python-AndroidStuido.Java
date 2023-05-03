from os.path import dirname, join
import pandas as pd
from sklearn.metrics.pairwise import cosine_similarity #veriler arasında benzerlik skoru oluşturur

filename = join(dirname(__file__), "cultural_dataset_csv.csv")
dataset = pd.read_csv(filename)

#dataset = pd.read_csv("cultural_dataset_csv.csv")


def tripPlanner(summer,winter,sea,skiing,nature,history,advanture,architecture,gastro,spa):

    dataset.loc[82, "summer"] = summer
    dataset.loc[82, "winter"] = winter
    dataset.loc[82, "sea"] = sea
    dataset.loc[82, "skiing"] = skiing
    dataset.loc[82, "nature"] = nature
    dataset.loc[82, "history"] = history
    dataset.loc[82, "advanture"] = advanture
    dataset.loc[82, "architecture"] = architecture
    dataset.loc[82, "gastro"] = gastro
    dataset.loc[82, "spa"] = spa
    #dataset.to_csv("csvFile.csv", index=False)

    city_titles = dataset["city"].tolist()
    print(city_titles)

    new_ds = dataset.drop(columns=["city", "id"])
    print(new_ds)

    similarity = cosine_similarity(new_ds)
    print(similarity)

    print(dataset.loc[[82]])

    city_index = 82
    city_index = int(city_index)
    print(city_index)

    similarity_score = list(enumerate(similarity[city_index]))
    sorted_cities = sorted(similarity_score, key=lambda x:x[1], reverse=True)

    result_list = []
    i = 1
    for city in sorted_cities:
        index = city[0]
        title_city = dataset[dataset.index == index]["city"].values[0]
        if (i < 6):
            #return(i, ".", title_city, similarity_score[i + 1])
            result_list.append(title_city)

            i += 1

    return(result_list[2])

